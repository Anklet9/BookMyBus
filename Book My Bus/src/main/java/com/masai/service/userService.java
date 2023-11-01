package com.masai.service;

import java.util.List;

import com.masai.exception.UserException;
import com.masai.model.User;

public interface userService {
	/**
	 *
	 * @param user
	 * @return
	 * @throws UserException
	 */
	public User addUser(User user) throws UserException;

	/**
	 *
	 * @param user
	 * @param key
	 * @return
	 * @throws UserException
	 */
	public User updateUser(User user,String key) throws UserException;

	/**
	 *
	 * @param userId
	 * @param key
	 * @return
	 * @throws UserException
	 */
	public User deleteUser(Integer userId,String key) throws UserException;

	/**
	 *
	 * @param userId
	 * @param key
	 * @return
	 * @throws UserException
	 */
	public User viewUser(Integer userId,String key) throws UserException;

	/**
	 *
	 * @param key
	 * @return
	 * @throws UserException
	 */
	public List<User> viewAllUsers(String key) throws UserException;
}