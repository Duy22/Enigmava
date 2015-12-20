package gui;

import java.awt.Component;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
public class CustomTableCellRenderer extends DefaultTableCellRenderer 
{
	private int rowNum = 0;
	private int colNum = 0;
	
    public Component getTableCellRendererComponent
       (JTable table, Object value, boolean isSelected,
       boolean hasFocus, int row, int column) 
    {
        Component cell = super.getTableCellRendererComponent
           (table, value, isSelected, hasFocus, row, column);
        if( value instanceof Integer )
        {
            Integer amount = (Integer) value;
            if( amount.intValue() < 0 )
            {
                cell.setBackground( Color.red );
                // You can also customize the Font and Foreground this way
                // cell.setForeground();
                // cell.setFont();
            }
            else
            {
                cell.setBackground( Color.white );
            }
        }
        return cell;
    }

	/**
	 * @param rowNum the rowNum to set
	 */
	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}

	/**
	 * @param colNum the colNum to set
	 */
	public void setColNum(int colNum) {
		this.colNum = colNum;
	}
    
}