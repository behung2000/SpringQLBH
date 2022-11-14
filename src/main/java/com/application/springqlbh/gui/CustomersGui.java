package com.application.springqlbh.gui;

import com.application.springqlbh.bill.CustomersBill;
import com.application.springqlbh.dal.Customers;
import com.application.springqlbh.dal.CustomersDal;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.List;
import java.util.Vector;

@Controller
public class CustomersGui extends JFrame{
    private JTable table1;
    private JPanel panel1;
    private CustomersBill customersBill;

    public CustomersGui(CustomersDal customersDal) {
        this.customersBill = new CustomersBill(customersDal);
    }

    public void init() {
        setContentPane(panel1);
        table1.setModel(tableModel(customersBill.getAllCustomers()));
        setVisible(true);
    }

    private TableModel tableModel(List<Customers> allCustomers) {
        Vector header = new Vector();
        header.add("Id");
        header.add("full name");
        header.add("address");
        header.add("city");
        DefaultTableModel model = new DefaultTableModel(header, 0);
        if (allCustomers!= null & !allCustomers.isEmpty()) {
            for (Customers customers : allCustomers) {
                Vector row = new Vector();
                row.add(customers.getCustomerId());
                row.add(customers.getFullname());
                row.add(customers.getAddress());
                row.add(customers.getCity());
                model.addRow(row);
            }
        }
        return model;
    }
}
