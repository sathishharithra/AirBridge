package com.emirates_app.services;

import java.util.List;

import com.emirates_app.entity.Passenger;

public interface PassengerService {
public void  savePassData(Passenger pass);

public List<Passenger> listallPassData(Passenger pass);

public void deleteOnePass(long id);

public Passenger updateOnePass(long id);

public void updateOnePass(Passenger pass1);


}
