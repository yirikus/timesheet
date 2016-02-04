package cz.yirikus.controller;

import cz.yirikus.service.TimesheetService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: TERRMITh
 * Date: 4.2.16
 * Time: 22:46
 * To change this template use File | Settings | File Templates.
 */
public class ContentController implements Initializable{

    private TimesheetService service = TimesheetService.instance();

    @FXML
    private TableView timesheetTable;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        service.initTimesheet();
        createTable(service.getTimesheet().getPeriod(YearMonth.now()).size(), YearMonth.now().getMonth().getValue());
    }

    private void createTable(int size, int month) {
        List<TableColumn> columns = new ArrayList<TableColumn>();
        columns.add(tableColumn("Task"));
        for(int i = 0; i < size; i++)
        columns.add(tableColumn((i + 1 ) + "." + month));
        timesheetTable.getColumns().addAll(columns);

//        TableColumn[] tableColumns = new TableColumn[columns.size()];
//        int columnIndex = 0;
//        for(int i=0 ; i<columns.size(); i++) {
//            final int j = i;
//            TableColumn col = new TableColumn(columns.get(i));
//            col.setCellValueFactory(new Callback<CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){
//                public ObservableValue<String> call(CellDataFeatures<ObservableList, String> param) {
//                    return new SimpleStringProperty(param.getValue().get(j).toString());
//                }
//            });

//        }
    }

    private TableColumn tableColumn(String col1) {
        TableColumn column = new TableColumn();
        column.setText(col1);
        return column;
    }
}
