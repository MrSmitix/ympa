-module(ympa_erlang_client_order_subsidy_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_subsidy_dto/0]).

-type ympa_erlang_client_order_subsidy_dto() ::
    #{ 'type' => ympa_erlang_client_order_subsidy_type:ympa_erlang_client_order_subsidy_type(),
       'amount' => integer()
     }.

encode(#{ 'type' := Type,
          'amount' := Amount
        }) ->
    #{ 'type' => Type,
       'amount' => Amount
     }.
