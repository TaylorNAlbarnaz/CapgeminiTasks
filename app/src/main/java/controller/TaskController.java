/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import model.Task;

/**
 *
 * @author GRUPO DB
 */
public class TaskController {
    public void save(Task task) {
        
    }
    
    public void update(Task task) {
        
    }
    
    public void removeById(int taskId) {
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement statament = null;
    }
    
    public List<Task> getAll(int idProject) {
        return null;
    }
}