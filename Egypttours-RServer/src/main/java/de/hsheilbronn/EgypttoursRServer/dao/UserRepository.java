package de.hsheilbronn.EgypttoursRServer.dao;

import de.hsheilbronn.EgypttoursRServer.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
