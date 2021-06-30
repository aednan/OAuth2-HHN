package de.hsheilbronn.EgypttoursRServer.dao;


import de.hsheilbronn.EgypttoursRServer.model.user.UPhone;
import de.hsheilbronn.EgypttoursRServer.model.user.UProfile;
import de.hsheilbronn.EgypttoursRServer.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UPhoneRepository extends JpaRepository<UPhone,String> {
    public Optional<UPhone> findByUser(User user);

}
