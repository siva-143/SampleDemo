package controllers;

import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Created by CGLenovo01 on 28-04-2017.
 */
public class AsynchronousController extends Controller{
    public CompletionStage<Result> index() {
        return CompletableFuture.supplyAsync(() -> {
            return intensiveComputation();
        })
                .thenApply(i -> ok("Got result: " + i));
    }

    private Integer intensiveComputation() {
        return (222/7+77907970);
    }
}
