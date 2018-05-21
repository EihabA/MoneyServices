package com.instantmoney.MoneyServices;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository // added annotation
public interface ExchangeRepository extends CrudRepository<Exchange, Long> {

}
