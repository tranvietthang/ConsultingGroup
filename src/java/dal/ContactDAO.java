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
import model.ContactModel;
import model.MessageModel;

/**
 *
 * @author ThangCoi
 */
public class ContactDAO {

    DBContext db = new DBContext();
    CloseConnection close = new CloseConnection();
    Connection conn;

    public ContactModel getValueContact() throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = db.getConnection();
            String sql = "select * from Contact";
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                ContactModel c = new ContactModel();
                c.setId(rs.getInt("id"));
                c.setTitle(rs.getString("title"));
                c.setDescription(rs.getString("description"));
                c.setImage(db.getImagePath() + rs.getString("image"));
                return c;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
        return null;
    }

    public void sentMesMessage(MessageModel m) throws Exception {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn = db.getConnection();
            String sql = "INSERT INTO [Message](name, email, message) VALUES (?, ?, ?)";
            st = conn.prepareStatement(sql);
            st.setString(1, m.getName());
            st.setString(2, m.getEmail());
            st.setString(3, m.getMessage());
            st.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            close.closeConnection(conn, rs, st);
        }
    }
}
