/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

/**
 *
 * @author GRUPO DB
 */
public class ProjectController {
    public void save(Project project) {
        String sql = "INSERT INTO project ("
                + "name, "
                + "description, "
                + "createdAt, "
                + "updatedAt) VALUES (?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
            statement.execute();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao criar o projeto!"
                    + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void update(Project project) {
        
    }
    
    public void removeById(int projectId) {
        
    }
    
    public List<Project> getAll() {
        
    }
}
