package com.thinkconstructive.rest_demo.service;

import com.thinkconstructive.rest_demo.Model.CloudVendor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudvendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
