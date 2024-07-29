package com.thinkconstructive.rest_demo.service.impl;

import com.thinkconstructive.rest_demo.Model.CloudVendor;
import com.thinkconstructive.rest_demo.repository.CloudVendorRepository;
import com.thinkconstructive.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorrepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorrepository){
        this.cloudVendorrepository=cloudVendorrepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor){
        cloudVendorrepository.save(cloudVendor);
        return " Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor){
        cloudVendorrepository.save(cloudVendor);
        return "Success";

    }

    @Override
    public String deleteCloudVendor(String cloudVendorId){
        cloudVendorrepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId){
        return cloudVendorrepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors(){
        return cloudVendorrepository.findAll();

    }




}
