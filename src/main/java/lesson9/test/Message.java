package lesson9.test;

/**
 * Created by admin on 13.03.2017.
 */
public class Message {

    private String parameterName;

    private double parameterValue;

    public Message(String parameterName, double parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    public Message(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public double getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(double parameterValue) {
        this.parameterValue = parameterValue;
    }
}
