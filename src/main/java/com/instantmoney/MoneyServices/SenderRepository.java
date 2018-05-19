package com.instantmoney.MoneyServices;

import org.springframework.data.repository.CrudRepository;
import com.instantmoney.MoneyServices.Sender;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface SenderRepository extends CrudRepository<Sender, Long> {

}