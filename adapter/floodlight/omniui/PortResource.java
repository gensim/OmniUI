package net.floodlightcontroller.omniui;

import java.util.ArrayList;
import java.util.List;

import net.floodlightcontroller.core.types.SwitchMessagePair;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class PortResource extends ServerResource {
    @Get("json")
    public List<PortInfo> retrieve() {
        return null;
    }
}