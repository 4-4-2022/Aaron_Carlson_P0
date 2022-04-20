package com.revature.repo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import com.revature.connectdb.Closer;
import com.revature.connectdb.ConnectDb;
import com.revature.model.user.Username;

public class UserRepo implements UsernameInterface {

public UserRepo()
		{


		try {
			ConnectDb.getConnection();
			ConnectDb conn = null;
			Statement stmt = null;
			ResultSet set = null;
			final String Uses = "select * from userfysh";
			System.out.println(Uses);


			//At this point, we have executed a statement and we have the records.
			set = stmt.executeQuery(Uses);
			while(set.next()) {
				Username.add(new Username(
						set.getString(1),
						set.getString(2),
						set.getInt(3),
						set.getString(4)
					);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			Closer.closeConnection(null);
			Closer.closeResultSet(set);
			Closer.closeStatement(stmt);
		}


	}

@Override
public Set<Username> findAllUsername() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Username findUser(String Username) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Username findUserpass(String Password) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Username findUserBalance(int Balance) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Username findUserAuth(String AuthUser) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void save(Username User) {
	// TODO Auto-generated method stub
	
}

@Override
public void update(Username User) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(Username User) {
	// TODO Auto-generated method stub
	
}

@Override
public void saveP(Username Password) {
	// TODO Auto-generated method stub
	
}

@Override
public void updateP(Username Password) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteP(Username Password) {
	// TODO Auto-generated method stub
	
}

@Override
public void saveB(Username Balance) {
	// TODO Auto-generated method stub
	
}

@Override
public void updateB(Username Balance) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteB(Username Balance) {
	// TODO Auto-generated method stub
	
}

}
