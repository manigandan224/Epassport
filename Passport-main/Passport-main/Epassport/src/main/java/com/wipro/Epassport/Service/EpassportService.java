package com.wipro.Epassport.Service;

import com.wipro.Epassport.Entity.Application;
import com.wipro.Epassport.Entity.Epassport;
import com.wipro.Epassport.Exception.UserAlreadyExistException;
import com.wipro.Epassport.Repository.ApplicationRepository;
import com.wipro.Epassport.Repository.EpassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EpassportService {
    @Autowired
    private EpassportRepository repository;

    @Autowired
    private ApplicationRepository applicationRepository;
    public void epassportRegistration(Epassport epassport){
        repository.save(epassport);

    }
    private boolean emailExists(final String email)
    {
        return repository.findByEmail(email)!=null;
    }
    private boolean emailExistsByApplication(final String email){
        return applicationRepository.findByEmail(email)!=null;
    }
    public Epassport save(Epassport registrationDto) {
        if(emailExists(registrationDto.getEmail()))
        {
            throw new UserAlreadyExistException("There is an account with that email address: "+registrationDto.getEmail());
        }
        Epassport epassport = new Epassport(registrationDto.getFirstName(),
                registrationDto.getLastName(), registrationDto.getTelephoneNumber(),
                registrationDto.getEmail(),registrationDto.getPassword());

        return repository.save(epassport);
    }
    public boolean login(Epassport registrationDto) {
        String password = repository.findByPassword(registrationDto.getEmail());
        if(registrationDto.getPassword().equals(password))
        {
            return true;
        }
        else{
            return false;
        }

    }
    public Application saveApplication(Application applicationDto)
    {
        if(emailExistsByApplication(applicationDto.getEmail()))
        {
            throw new UserAlreadyExistException("There is an account with that email address:"+applicationDto.getEmail());
        }
        Application application = new Application(applicationDto.getFirstName(),applicationDto.getLastName(),applicationDto.getDate_of_birth(),
                applicationDto.getPlace_of_birth(),applicationDto.getGender(),applicationDto.getState(),applicationDto.getDistrict(),applicationDto.getMartial_status(),
                applicationDto.getPan(),applicationDto.getEmploymentType(),applicationDto.getEducationDetails(),applicationDto.getFatherName(), applicationDto.getMotherName(),
                applicationDto.getHouseNo(),applicationDto.getStreetName(),applicationDto.getCity(),applicationDto.getPincode(),applicationDto.getTelephoneNumber(),
                applicationDto.getEmail(),applicationDto.getReferenceName(),applicationDto.getReferenceAddress(),applicationDto.getReferenceTelephoneNumber());
        return applicationRepository.save(application);
    }
    public Application getAllEpassportDetailsByEmailId(String email)
    {
        return applicationRepository.findByEmailId(email);
    }
}
