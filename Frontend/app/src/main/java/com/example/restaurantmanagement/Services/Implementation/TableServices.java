package com.example.restaurantmanagement.Services.Implementation;

import com.example.restaurantmanagement.Models.AddOrderToTableRequest;
import com.example.restaurantmanagement.Models.ApiResponse;
import com.example.restaurantmanagement.Models.BaseResponse;
import com.example.restaurantmanagement.Models.ChangeStatusOfOrderRequest;
import com.example.restaurantmanagement.Models.GetOrderedFoodRequest;
import com.example.restaurantmanagement.Models.OpenTableRequest;
import com.example.restaurantmanagement.Models.Order;
import com.example.restaurantmanagement.Models.Table;
import com.example.restaurantmanagement.Models.TableTransactionDetail;
import com.example.restaurantmanagement.Services.Interface.IAuthServices;
import com.example.restaurantmanagement.Services.Interface.ITableServices;
import com.example.restaurantmanagement.Utilities.HttpHelper;

import java.util.ArrayList;

import io.reactivex.Observable;

public class TableServices {
    public static ApiResponse<ArrayList<Table>> getAllTables() {
        try{
            ITableServices tableServices = HttpHelper.CreateApiService(ITableServices.class);

            return new ApiResponse(tableServices.getAllTables());

        }catch(Exception ex){
            throw ex;
        }
    }

    public static ApiResponse<Boolean> openTable(OpenTableRequest req) {
        try{
            ITableServices tableServices = HttpHelper.CreateApiService(ITableServices.class);

            return new ApiResponse(tableServices.openTable(req));

        }catch(Exception ex){
            throw ex;
        }
    }

    public static ApiResponse<Boolean> closeTable(OpenTableRequest req) {
        try{
            ITableServices tableServices = HttpHelper.CreateApiService(ITableServices.class);

            return new ApiResponse(tableServices.closeTable(req));
        }catch(Exception ex){
            throw ex;
        }
    }

    public static ApiResponse<TableTransactionDetail> getTableDetail(OpenTableRequest req){
        try{
            ITableServices tableServices = HttpHelper.CreateApiService(ITableServices.class);

            return new ApiResponse(tableServices.getTableDetail(req));

        }catch(Exception ex){
            throw ex;
        }
    }

    public static ApiResponse<ArrayList<Order>> getAllOrderedFoodByRole(GetOrderedFoodRequest req){
        try{
            ITableServices tableServices = HttpHelper.CreateApiService(ITableServices.class);

            return new ApiResponse(tableServices.getAllOrderedFoodByRole(req));
        }catch(Exception ex){
            throw ex;
        }
    }

    public static ApiResponse<Boolean> addFoodsToTable(AddOrderToTableRequest req){
        try{
            ITableServices tableServices = HttpHelper.CreateApiService(ITableServices.class);

            return new ApiResponse(tableServices.addFoodsToTable(req));
        }
        catch(Exception ex){
            throw ex;
        }
    }

    public static ApiResponse<Boolean> changeStatusOfOrder(ChangeStatusOfOrderRequest req){
        try{
            ITableServices tableServices = HttpHelper.CreateApiService(ITableServices.class);

            return new ApiResponse(tableServices.changeStatusOfOrder(req));
        }
        catch(Exception ex){
            throw ex;
        }
    }

    public static ApiResponse<TableTransactionDetail> getOrderSummary(OpenTableRequest req){
        try{
            ITableServices tableServices = HttpHelper.CreateApiService(ITableServices.class);

            return new ApiResponse(tableServices.getOrderSummary(req));
        }
        catch(Exception ex){
            throw ex;
        }
    }
}
