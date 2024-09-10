-module(ympa_erlang_client_outlet_license_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_outlet_license_dto/0]).

-type ympa_erlang_client_outlet_license_dto() ::
    #{ 'id' => integer(),
       'outletId' => integer(),
       'licenseType' => ympa_erlang_client_license_type:ympa_erlang_client_license_type(),
       'number' => binary(),
       'dateOfIssue' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'dateOfExpiry' => ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'id' := Id,
          'outletId' := OutletId,
          'licenseType' := LicenseType,
          'number' := Number,
          'dateOfIssue' := DateOfIssue,
          'dateOfExpiry' := DateOfExpiry
        }) ->
    #{ 'id' => Id,
       'outletId' => OutletId,
       'licenseType' => LicenseType,
       'number' => Number,
       'dateOfIssue' => DateOfIssue,
       'dateOfExpiry' => DateOfExpiry
     }.
