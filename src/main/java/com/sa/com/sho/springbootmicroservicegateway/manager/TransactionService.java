package com.sa.com.sho.springbootmicroservicegateway.manager;

import com.google.gson.JsonElement;
import com.sa.com.sho.springbootmicroservicegateway.request.ITransactionServiceRequest;
import com.sa.com.sho.springbootmicroservicegateway.util.RetrofitUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService implements ITransactionService{

    @Autowired
    private ITransactionServiceRequest transactionServiceRequest;


    @Override
    public JsonElement saveTransaction(JsonElement transaction)
    {
        return RetrofitUtils.executeInUtil(transactionServiceRequest.saveTransaction(transaction));
    }

    @Override
    public void deleteTransaction(Long transactionId)
    {
        RetrofitUtils.executeInUtil(transactionServiceRequest.deleteTransaction(transactionId));
    }

    @Override
    public List<JsonElement> getAllTransactionsOfUser(Long userId)
    {
        return RetrofitUtils.executeInUtil(transactionServiceRequest.getAllTransactionsOfAuthorizedUser(userId));
    }
}
