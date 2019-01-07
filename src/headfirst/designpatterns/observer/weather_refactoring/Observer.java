package headfirst.designpatterns.observer.weather_refactoring;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
