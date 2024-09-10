-module(ympa_erlang_client_order_item_instance_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_item_instance_dto/0]).

-type ympa_erlang_client_order_item_instance_dto() ::
    #{ 'cis' => binary(),
       'cisFull' => binary(),
       'uin' => binary(),
       'rnpt' => binary(),
       'gtd' => binary()
     }.

encode(#{ 'cis' := Cis,
          'cisFull' := CisFull,
          'uin' := Uin,
          'rnpt' := Rnpt,
          'gtd' := Gtd
        }) ->
    #{ 'cis' => Cis,
       'cisFull' => CisFull,
       'uin' => Uin,
       'rnpt' => Rnpt,
       'gtd' => Gtd
     }.
