package io.obswebsocket.community.client.listener.request;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

import io.obswebsocket.community.client.message.request.Request;
import io.obswebsocket.community.client.message.request.RequestBatch;
import io.obswebsocket.community.client.message.response.RequestBatchResponse;
import io.obswebsocket.community.client.message.response.RequestResponse;

public class ObsRequestListenerImpl implements ObsRequestListener {

  private final ConcurrentHashMap<String, Consumer> requestListeners = new ConcurrentHashMap<>();

  @Override
  public void registerRequest(Request request, Consumer callback) {
    this.requestListeners.put(request.getData().getRequestId(), callback);
  }

  @Override
  public void onRequestResponse(RequestResponse requestResponse) {
    try {
      if (this.requestListeners.containsKey(requestResponse.getMessageData().getRequestId())) {
        this.requestListeners.get(requestResponse.getMessageData().getRequestId()).accept(requestResponse);
      }
    } finally {
      this.requestListeners.remove(requestResponse.getMessageData().getRequestId());
    }
  }

  @Override
  public void registerRequestBatch(RequestBatch requestBatch, Consumer callback) {
    this.requestListeners.put(requestBatch.getRequestId(), callback);
  }

  @Override
  public void onRequestBatchResponse(RequestBatchResponse requestBatchResponse) {
    try {
      if (this.requestListeners.containsKey(requestBatchResponse.getRequestId())) {
        this.requestListeners.get(requestBatchResponse.getRequestId()).accept(requestBatchResponse);
      }
    } finally {
      this.requestListeners.remove(requestBatchResponse.getRequestId());
    }
  }

}
