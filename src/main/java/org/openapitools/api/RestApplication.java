package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.BusinessesApiServiceImpl;
import org.openapitools.api.impl.CampaignsApiServiceImpl;
import org.openapitools.api.impl.CategoriesApiServiceImpl;
import org.openapitools.api.impl.CategoryApiServiceImpl;
import org.openapitools.api.impl.DeliveryApiServiceImpl;
import org.openapitools.api.impl.ModelsApiServiceImpl;
import org.openapitools.api.impl.RegionsApiServiceImpl;
import org.openapitools.api.impl.ReportsApiServiceImpl;
import org.openapitools.api.impl.TariffsApiServiceImpl;
import org.openapitools.api.impl.WarehousesApiServiceImpl;

@ApplicationPath("")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(BusinessesApiServiceImpl.class);
        resources.add(CampaignsApiServiceImpl.class);
        resources.add(CategoriesApiServiceImpl.class);
        resources.add(CategoryApiServiceImpl.class);
        resources.add(DeliveryApiServiceImpl.class);
        resources.add(ModelsApiServiceImpl.class);
        resources.add(RegionsApiServiceImpl.class);
        resources.add(ReportsApiServiceImpl.class);
        resources.add(TariffsApiServiceImpl.class);
        resources.add(WarehousesApiServiceImpl.class);

        return resources;
    }




}