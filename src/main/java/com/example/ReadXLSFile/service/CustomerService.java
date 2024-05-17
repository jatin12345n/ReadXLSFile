package com.example.ReadXLSFile.service;

import com.example.ReadXLSFile.model.Customer;
import com.example.ReadXLSFile.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;
    public void saveCustomersToDatabase(MultipartFile file) {
        if (ExcelUploadService.isValidExcelFile(file)) {
            try {
                List<Customer> customers = ExcelUploadService.getCustomersDataFromExcel(file.getInputStream());
                this.customerRepository.saveAll(customers);
            } catch (IOException e) {
                throw new IllegalArgumentException("This file is not valid excel file");
            }
        }
    }
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
