from flask_cors import CORS
from flask import Flask, jsonify

def create_app():
    app = Flask(__name__)
    app.config['SECRET_KEY'] = "fxdcgtcfyxdbjdxfybjtcbnxccfvhbhf"
    CORS(app)
    from .queries import queries

    app.register_blueprint(queries, url_prefix = '/')

    return app