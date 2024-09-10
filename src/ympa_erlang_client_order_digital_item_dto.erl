-module(ympa_erlang_client_order_digital_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_digital_item_dto/0]).

-type ympa_erlang_client_order_digital_item_dto() ::
    #{ 'id' := integer(),
       'code' := binary(),
       'slip' := binary(),
       'activate_till' := calendar:date()
     }.

encode(#{ 'id' := Id,
          'code' := Code,
          'slip' := Slip,
          'activate_till' := ActivateTill
        }) ->
    #{ 'id' => Id,
       'code' => Code,
       'slip' => Slip,
       'activate_till' => ActivateTill
     }.
