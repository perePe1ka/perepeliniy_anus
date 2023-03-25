package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class raveMusic implements Music {
    private raveMusic() {}
    @Override
    public String getSong() {return "CMH IS GOD";}
}
