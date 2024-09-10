-module(ympa_erlang_client_brief_order_item_instance_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_brief_order_item_instance_dto/0]).

-type ympa_erlang_client_brief_order_item_instance_dto() ::
    #{ 'cis' => binary(),
       'uin' => binary(),
       'rnpt' => binary(),
       'gtd' => binary()
     }.

encode(#{ 'cis' := Cis,
          'uin' := Uin,
          'rnpt' := Rnpt,
          'gtd' := Gtd
        }) ->
    #{ 'cis' => Cis,
       'uin' => Uin,
       'rnpt' => Rnpt,
       'gtd' => Gtd
     }.
