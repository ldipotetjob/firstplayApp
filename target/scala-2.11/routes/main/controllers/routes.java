
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ldipotet/scalaplayex/firstplayApp/conf/routes
// @DATE:Wed Apr 06 17:35:42 CEST 2016

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseApplicationJson ApplicationJson = new controllers.ReverseApplicationJson(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseApplicationJson ApplicationJson = new controllers.javascript.ReverseApplicationJson(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
