package sports.exceptions;

public class PessangerDoesNotFoundException extends RuntimeException {
    private String message;

    public PessangerDoesNotFoundException(String message){
        this.message = message;
    }


    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
