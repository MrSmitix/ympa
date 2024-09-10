-module(ympa_erlang_client_order_buyer_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_buyer_info_dto/0]).

-type ympa_erlang_client_order_buyer_info_dto() ::
    #{ 'id' => binary(),
       'lastName' => binary(),
       'firstName' => binary(),
       'middleName' => binary(),
       'type' => ympa_erlang_client_order_buyer_type:ympa_erlang_client_order_buyer_type(),
       'phone' => binary()
     }.

encode(#{ 'id' := Id,
          'lastName' := LastName,
          'firstName' := FirstName,
          'middleName' := MiddleName,
          'type' := Type,
          'phone' := Phone
        }) ->
    #{ 'id' => Id,
       'lastName' => LastName,
       'firstName' => FirstName,
       'middleName' => MiddleName,
       'type' => Type,
       'phone' => Phone
     }.
