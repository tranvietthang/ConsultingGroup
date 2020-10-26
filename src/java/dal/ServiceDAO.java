/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import dbContext.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.ServiceModel;

/**
 *
 * @author ThangCoi
 */
public class ServiceDAO {

    DBContext db = new DBContext();
    CloseConnection close = new CloseConnection();
    Connection conn = null;

    public ArrayList<ServiceModel> getValueService() throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList<ServiceModel> list = new ArrayList<>();
        try {
            conn = db.getConnection();
            String sql = "select * from Service";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ServiceModel s = new ServiceModel();
                s.setId(rs.getInt("id"));
                s.setTitle(rs.getString("title"));
                s.setContent(rs.getString("content"));
                s.setType(rs.getString("type"));
                if (rs.getString("image") == null) {
                    s.setImage("null");
                } else {
                    s.setImage(db.getImagePath() + rs.getString("image"));
                }
                list.add(s);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
        return list;
    }
}
