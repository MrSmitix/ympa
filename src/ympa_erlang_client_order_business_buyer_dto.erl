-module(ympa_erlang_client_order_business_buyer_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_business_buyer_dto/0]).

-type ympa_erlang_client_order_business_buyer_dto() ::
    #{ 'inn' => binary(),
       'kpp' => binary(),
       'organizationName' => binary(),
       'organizationJurAddress' => binary()
     }.

encode(#{ 'inn' := Inn,
          'kpp' := Kpp,
          'organizationName' := OrganizationName,
          'organizationJurAddress' := OrganizationJurAddress
        }) ->
    #{ 'inn' => Inn,
       'kpp' => Kpp,
       'organizationName' => OrganizationName,
       'organizationJurAddress' => OrganizationJurAddress
     }.
