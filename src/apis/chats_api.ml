(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

let create_chat ~business_id ~create_chat_request_t =
    let open Lwt.Infix in
    let uri = Request.build_uri "/businesses/{businessId}/chats/new" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "businessId" Int64.to_string business_id in
    let body = Request.write_as_json_body Create_chat_request.to_yojson create_chat_request_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Create_chat_response.of_yojson) resp body

let get_chat_history ~business_id ~chat_id ~get_chat_history_request_t ?page_token ?limit () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/businesses/{businessId}/chats/history" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "businessId" Int64.to_string business_id in
    let uri = Request.add_query_param uri "chatId" Int64.to_string chat_id in
    let uri = Request.maybe_add_query_param uri "page_token" (fun x -> x) page_token in
    let uri = Request.maybe_add_query_param uri "limit" Int32.to_string limit in
    let body = Request.write_as_json_body Get_chat_history_request.to_yojson get_chat_history_request_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Get_chat_history_response.of_yojson) resp body

let get_chats ~business_id ~get_chats_request_t ?page_token ?limit () =
    let open Lwt.Infix in
    let uri = Request.build_uri "/businesses/{businessId}/chats" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "businessId" Int64.to_string business_id in
    let uri = Request.maybe_add_query_param uri "page_token" (fun x -> x) page_token in
    let uri = Request.maybe_add_query_param uri "limit" Int32.to_string limit in
    let body = Request.write_as_json_body Get_chats_request.to_yojson get_chats_request_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Get_chats_response.of_yojson) resp body

let send_file_to_chat ~business_id ~chat_id ~file =
    let open Lwt.Infix in
    let uri = Request.build_uri "/businesses/{businessId}/chats/file/send" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "businessId" Int64.to_string business_id in
    let uri = Request.add_query_param uri "chatId" Int64.to_string chat_id in
    let body = Request.init_form_encoded_body () in
    let body = Request.add_form_encoded_body_param body "file" (fun x -> x) file in
    let body = Request.finalize_form_encoded_body body in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Empty_api_response.of_yojson) resp body

let send_message_to_chat ~business_id ~chat_id ~send_message_to_chat_request_t =
    let open Lwt.Infix in
    let uri = Request.build_uri "/businesses/{businessId}/chats/message" in
    let headers = Request.default_headers in
    let uri = Request.replace_path_param uri "businessId" Int64.to_string business_id in
    let uri = Request.add_query_param uri "chatId" Int64.to_string chat_id in
    let body = Request.write_as_json_body Send_message_to_chat_request.to_yojson send_message_to_chat_request_t in
    Cohttp_lwt_unix.Client.call `POST uri ~headers ~body >>= fun (resp, body) ->
    Request.read_json_body_as (JsonSupport.unwrap Empty_api_response.of_yojson) resp body

