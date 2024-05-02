from flask import Blueprint, request, jsonify

queries = Blueprint('queries',__name__)

@queries.route('/process-code', methods = ['POST'])
def process():
    code = request.json.get('code',[])
    
    return jsonify({'response':'For Now'})