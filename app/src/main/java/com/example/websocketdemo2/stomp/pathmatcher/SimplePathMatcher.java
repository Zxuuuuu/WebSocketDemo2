package com.example.websocketdemo2.stomp.pathmatcher;

import com.example.websocketdemo2.stomp.dto.StompHeader;
import com.example.websocketdemo2.stomp.dto.StompMessage;

public class SimplePathMatcher implements PathMatcher {

    @Override
    public boolean matches(String path, StompMessage msg) {
        String dest = msg.findHeader(StompHeader.DESTINATION);
        if (dest == null) return false;
        else return path.equals(dest);
    }
}
