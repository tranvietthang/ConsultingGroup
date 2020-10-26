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
import model.HomeModel;

/**
 *
 * @author ThangCoi
 */
public class HomeDAO {

    DBContext db = new DBContext();
    CloseConnection close = new CloseConnection();
    Connection conn = null;

    public HomeModel getValueWelcome() throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = db.getConnection();
            String sql = "select * from Home where type = 'welcome'";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                HomeModel h = new HomeModel();
                h.setId(rs.getInt("id"));
                h.setTitle(rs.getString("title"));
                h.setDescription(rs.getString("description"));
                h.setType(rs.getString("type"));
                h.setImage(db.getImagePath() + rs.getString("image"));
                return h;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
        return null;
    }

    public HomeModel getValueContact() throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = db.getConnection();
            String sql = "select * from Home where type = 'contact'";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                HomeModel h = new HomeModel();
                h.setId(rs.getInt("id"));
                h.setTitle(rs.getString("title"));
                h.setDescription(rs.getString("description"));
                h.setType(rs.getString("type"));
                h.setImage(db.getImagePath() + rs.getString("image"));
                return h;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
        return null;
    }

    public HomeModel getValueService() throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = db.getConnection();
            String sql = "select * from Home where type = 'service'";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                HomeModel h = new HomeModel();
                h.setId(rs.getInt("id"));
                h.setTitle(rs.getString("title"));
                h.setDescription(rs.getString("description"));
                h.setType(rs.getString("type"));
                h.setImage(db.getImagePath() + rs.getString("image"));
                return h;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
        return null;
    }
}
