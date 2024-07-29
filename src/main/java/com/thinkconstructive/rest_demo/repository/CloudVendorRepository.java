package com.thinkconstructive.rest_demo.repository;

import com.thinkconstructive.rest_demo.Model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor, String>{
}
