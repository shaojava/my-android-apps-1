#define _WIN32_DCOM
#include <iostream>
using namespace std;
#include <wbemidl.h>
# pragma comment(lib, "wbemuuid.lib")


void main_2()
{
//	initComCall();

}

HRESULT initComCall()
{
HRESULT hr;
hr = CoInitializeEx(0, COINIT_MULTITHREADED); 
if (FAILED(hr)) 
{ cout << "Failed to initialize COM library. Error code = 0x"
       << hex << hr << endl; 
  return hr;
}
}

HRESULT initComSecurity()
{
HRESULT hr;
hr =  CoInitializeSecurity(
    NULL,                      // Security descriptor    
    -1,                        // COM negotiates authentication service
    NULL,                      // Authentication services
    NULL,                      // Reserved
    RPC_C_AUTHN_LEVEL_DEFAULT, // Default authentication level for proxies
    RPC_C_IMP_LEVEL_IMPERSONATE, // Default Impersonation level for proxies
    NULL,                        // Authentication info
    EOAC_NONE,                   // Additional capabilities of the client or server
    NULL);                       // Reserved

if (FAILED(hr))
{
   cout << "Failed to initialize security. Error code = 0x" 
        << hex << hr << endl;
   CoUninitialize();
   return hr;                  // Program has failed.
}
}
