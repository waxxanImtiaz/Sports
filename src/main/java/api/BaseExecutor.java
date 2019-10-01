package api;


import java.util.List;

public class BaseExecutor {

    private static BaseResponse baseResponse;
    private static final String DATA_NOT_FOUND = "Data Not Found";
    private static final String ITEM_UPDATED = "Item updated successfully!";
    private static final String ITEM_NOT_UPDATED =  "Item not updated";
    private static final String DATA_NOT_FOUND_REQ_CODE = "-1";
    private static final String SUCCESS_REQ_CODE = "0";
    private static final String FAILURE_REQ_CODE = "1";
    private static String DEFAULT_MESSAGE = "";
    private static String SIGNUP_SUCCESS_MESSAGE = "Signed up successfully!";


    @SuppressWarnings("unchecked")
    public static BaseResponse getBaseResponse(Object returnObject){
        if (baseResponse == null)
            baseResponse = new BaseResponse();

        if (returnObject == null){
            baseResponse.setMessage(DATA_NOT_FOUND);
            baseResponse.setResCode(DATA_NOT_FOUND_REQ_CODE);
            return baseResponse;
        }
        if (returnObject instanceof List)
        {
            if(((List)returnObject).size()>0)
            {
                baseResponse.setResponseObject(returnObject);
                baseResponse.setMessage( DEFAULT_MESSAGE);
                baseResponse.setResCode( SUCCESS_REQ_CODE);
                return baseResponse;
            }
            else {
                baseResponse.setMessage( DATA_NOT_FOUND);
                baseResponse.setResCode( DATA_NOT_FOUND_REQ_CODE);
                return baseResponse;
            }

        }

        baseResponse.setResponseObject(returnObject);
        baseResponse.setMessage( DEFAULT_MESSAGE);
        baseResponse.setResCode( SUCCESS_REQ_CODE);

        return baseResponse;
    }

}
