-module(ympa_erlang_client_return_instance_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_return_instance_dto/0]).

-type ympa_erlang_client_return_instance_dto() ::
    #{ 'stockType' => ympa_erlang_client_return_instance_stock_type:ympa_erlang_client_return_instance_stock_type(),
       'status' => ympa_erlang_client_return_instance_status_type:ympa_erlang_client_return_instance_status_type(),
       'cis' => binary(),
       'imei' => binary()
     }.

encode(#{ 'stockType' := StockType,
          'status' := Status,
          'cis' := Cis,
          'imei' := Imei
        }) ->
    #{ 'stockType' => StockType,
       'status' => Status,
       'cis' => Cis,
       'imei' => Imei
     }.
