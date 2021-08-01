/**
 * 
 */
package com.adosft.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adosft.springboot.model.Country;


/**
 * @author admin
 *
 */
@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}
