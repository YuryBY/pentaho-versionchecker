package org.pentaho.versionchecker.util.winregistry;

import java.lang.reflect.InvocationTargetException;

public class WinRegistryUtilUsageExample {

  public static void main( String[] args ) {

    String winCurrentVersionKey = "SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion";
    String winCurrentVersionKeyName = "ProductName";
    String value = "";

    try {
      value =
          WinRegistryUtil.readString( WinRegistryUtil.HKEY_LOCAL_MACHINE, winCurrentVersionKey,
              winCurrentVersionKeyName );
    } catch ( IllegalArgumentException e ) {
      e.printStackTrace();
    } catch ( IllegalAccessException e ) {
      e.printStackTrace();
    } catch ( InvocationTargetException e ) {
      e.printStackTrace();
    }

    System.out.println( "Windows Distribution = " + value );
  }

}
