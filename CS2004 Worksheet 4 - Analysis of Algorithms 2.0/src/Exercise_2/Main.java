package Exercise_2;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		stage.setTitle("Run Time Complexity B/w Two Algorithms");
        final NumberAxis xAxis = new NumberAxis(0, 10, 1);
        final NumberAxis yAxis = new NumberAxis(0, 18000, 1000);        
        final ScatterChart<Number,Number> sc = new
            ScatterChart<Number,Number>(xAxis,yAxis);
        xAxis.setLabel("X-axis");                
        yAxis.setLabel("Y-axis");
        sc.setTitle("Analysis between Two Algorithms");
       
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Prefix Average 1");
        series1.getData().add(new XYChart.Data(1, 17300));
        series1.getData().add(new XYChart.Data(2, 10800));
        series1.getData().add(new XYChart.Data(3, 10900));
        series1.getData().add(new XYChart.Data(4, 12600));
        series1.getData().add(new XYChart.Data(5, 11700));
        series1.getData().add(new XYChart.Data(6, 15900));
        
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Prefix Average 2");
        series2.getData().add(new XYChart.Data(1, 13000));
        series2.getData().add(new XYChart.Data(2,  9300));
        series2.getData().add(new XYChart.Data(3,  9200));
        series2.getData().add(new XYChart.Data(4,  9400));
        series2.getData().add(new XYChart.Data(5,  7500));
        series2.getData().add(new XYChart.Data(6, 10000));
 
        sc.getData().addAll(series1, series2);
        Scene scene  = new Scene(sc, 500, 400);
        stage.setScene(scene);
        stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
