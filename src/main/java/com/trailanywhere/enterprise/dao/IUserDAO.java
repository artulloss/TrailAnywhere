package com.trailanywhere.enterprise.dao;

import com.trailanywhere.enterprise.dto.Trail;
import com.trailanywhere.enterprise.dto.User;

import java.util.List;

/**
 * Interface for CRUD operations related to users
 */
public interface IUserDAO {
    /**
     * Save a user
     * @param user - user object
     * @return - new user
     * @throws Exception - handle errors
     */
    User save(User user) throws Exception;

    /**
     * Delete a user
     * @param user - user to be deleted
     * @throws Exception - handle errors
     */
    void delete(User user) throws Exception;

    /**
     * Fetch a user's favorite trails
     *
     * @return - list of trails
     */
    List<Trail> fetchFavoriteTrails(User user);

    /**
     * Add a favorite trail
     * @param user - user who's adding the trail
     * @param trail - trail to be added
     */
    void addFavoriteTrail(User user, Trail trail);

    /**
     * Remove a favorite trail
     * @param user - User
     * @param trail - Trail to be unfavorited
     */
    void deleteFavoriteTrail(User user, Trail trail);

    /**
     * Find a user based on their credentials
     * @param email - email address
     * @param password - user password
     */
    User findUser(String email, String password);
}