-module(ympa_erlang_client_offer_selling_program_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_selling_program_dto/0]).

-type ympa_erlang_client_offer_selling_program_dto() ::
    #{ 'sellingProgram' := ympa_erlang_client_selling_program_type:ympa_erlang_client_selling_program_type(),
       'status' := ympa_erlang_client_offer_selling_program_status_type:ympa_erlang_client_offer_selling_program_status_type()
     }.

encode(#{ 'sellingProgram' := SellingProgram,
          'status' := Status
        }) ->
    #{ 'sellingProgram' => SellingProgram,
       'status' => Status
     }.
