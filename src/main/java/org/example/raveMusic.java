package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class raveMusic implements Music {
    private raveMusic() {}
    @Override
    public String getSong() {return "CMH IS GOD";}
}
