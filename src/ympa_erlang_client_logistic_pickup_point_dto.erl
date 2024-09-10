-module(ympa_erlang_client_logistic_pickup_point_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_logistic_pickup_point_dto/0]).

-type ympa_erlang_client_logistic_pickup_point_dto() ::
    #{ 'id' => integer(),
       'name' => binary(),
       'address' => ympa_erlang_client_pickup_address_dto:ympa_erlang_client_pickup_address_dto(),
       'instruction' => binary(),
       'type' => ympa_erlang_client_logistic_point_type:ympa_erlang_client_logistic_point_type(),
       'logisticPartnerId' => integer()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'address' := Address,
          'instruction' := Instruction,
          'type' := Type,
          'logisticPartnerId' := LogisticPartnerId
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'address' => Address,
       'instruction' => Instruction,
       'type' => Type,
       'logisticPartnerId' => LogisticPartnerId
     }.
