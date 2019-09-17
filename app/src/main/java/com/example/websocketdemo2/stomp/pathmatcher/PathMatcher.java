package com.example.websocketdemo2.stomp.pathmatcher;


import com.example.websocketdemo2.stomp.dto.StompMessage;

public interface PathMatcher {

    boolean matches(String path, StompMessage msg);
}
