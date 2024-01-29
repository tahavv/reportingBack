package com.example.backend.services;

import com.example.backend.entities.Function;
import com.example.backend.entities.PasswordUpdateRequest;
import com.example.backend.entities.RepRapport;
import com.example.backend.entities.User;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    Object customResponse(Long id);

    User addUser(User user,Long idGrp);
    User editUser(User user,Long idGrp);

    List<User> getListUser();

    void deleteUser(Long id);

    User findById(Long id);

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String username);

    Optional<User> findByToken(String username);

    void assignFunc(Long id, List<RepRapport> rap);

    void detachRep(Long id,RepRapport rep);

    void assignRapport(Long id, Long idrep);

    void removeRapport(Long id, Long idrep);
    List<BigInteger> findReportsByUserId(Long functionId);

    User updatePassword(String username, String oldPassword, String newPassword) throws Exception;

    void updatePass(PasswordUpdateRequest request);
}
